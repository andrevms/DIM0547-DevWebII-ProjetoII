import { Component, OnInit } from '@angular/core';
import { SessaoUsuarioService } from '../../../autenticacao/sessao-usuario.service';
import { TokenService } from '../../../autenticacao/token.service';

@Component({
  selector: 'app-prova-listar',
  templateUrl: './prova-listar.component.html',
  styleUrls: ['./prova-listar.component.scss'],
})
export class ProvaListarComponent implements OnInit {
  constructor(
    private _sessaoUsuarioService: SessaoUsuarioService,
    private _tokenService: TokenService
  ) {}

  ngOnInit(): void {
    // this._usuarioService.getUsuario().subscribe((res) => {
    //   console.log(res);
    // });
    // console.log(this._tokenService.possuiToken());
  }
}
