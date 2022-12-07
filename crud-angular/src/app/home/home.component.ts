import { Component, OnInit } from '@angular/core';
import { SessaoUsuarioService } from '../autenticacao/sessao-usuario.service';
import { QuestaoHttpService } from '../common/http/questao-http.service';
import { IQuestao } from '../common/models/questao';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss'],
})
export class HomeComponent implements OnInit {
  questoes: IQuestao[] = [];

  constructor(private _questaoHttpService: QuestaoHttpService,
    private _sessaoUsuarioService: SessaoUsuarioService) { }

  ngOnInit() {
    if (this._sessaoUsuarioService.estaLogado()) {
      this._carregarQuestao();
    }
  }

  private _carregarQuestao() {
    this._questaoHttpService.recuperar().subscribe((res) => {
      this.questoes = res as any;
      console.log(res);

    });
  }
}
