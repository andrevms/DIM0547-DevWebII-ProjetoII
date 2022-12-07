import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AutorizacaoService } from './autenticacao/autorizacao.service';
import { IUsuarioAutenticadoInfoResponseDto, UsuarioPapel } from './autenticacao/interfaces';
import { SessaoUsuarioService } from './autenticacao/sessao-usuario.service';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
})
export class AppComponent {
  title = 'Estuda Concursos';

  constructor(
    private _autorizacaoService: AutorizacaoService,
    private _sessaoUsuarioService: SessaoUsuarioService,
    private _router: Router
  ) { }

  isLogged() {
    return this._sessaoUsuarioService.estaLogado();
  }

  temPapel() {
    if (this._autorizacaoService.temPapel(UsuarioPapel.Administrador)) {
      return true;
    } else {
      this._router.navigate(['/admin/sem-autorizacao']);
      return false;
    }
  }

  logout() {
    this._sessaoUsuarioService.destruirSessao();
    this._router.navigate(['']);
    window.location.reload();
  }
}
