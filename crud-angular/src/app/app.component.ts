import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { SessaoUsuarioService } from './autenticacao/sessao-usuario.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
})
export class AppComponent {
  title = 'Estuda Concursos';

  constructor(
    private _sessaoUsuarioService: SessaoUsuarioService,
    private _router: Router
  ) {}

  isLogged() {
    return this._sessaoUsuarioService.estaLogado();
  }

  logout() {
    this._sessaoUsuarioService.destruirSessao();
    this._router.navigate(['']);
  }
}
