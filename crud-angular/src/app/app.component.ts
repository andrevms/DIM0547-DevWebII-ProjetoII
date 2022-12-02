import { Component } from '@angular/core';
import { SessaoUsuarioService } from './autenticacao/sessao-usuario.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  constructor(private _sessaoUsuarioService: SessaoUsuarioService) {}

  isLogged() {
    return this._sessaoUsuarioService.estaLogado();
  }

  title = 'crud-angular';
}
