import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';
import { TokenService } from '../token.service';
import { Usuario } from './usuario';

@Injectable({
  providedIn: 'root',
})
export class UsuarioService {
  private usuarioSubject = new BehaviorSubject<Usuario>({});

  constructor(private tokenService: TokenService) {
    if (this.tokenService.possuiToken()) {
      this.getInfoUsuario();
    }
  }

  private getInfoUsuario() {
    const token = this.tokenService.getToken();
    const usuario = {
      id: 1,
      nome: 'Fulano Admin',
      email: 'fulanoadmin@email.com',
      token: '',
    };
    this.usuarioSubject.next(usuario);
  }

  getUsuario() {
    return this.usuarioSubject.asObservable();
  }

  salvarToken(token: string) {
    this.tokenService.salvarToken(token);
    this.getInfoUsuario();
  }

  logout() {
    this.tokenService.excluirToken();
    this.usuarioSubject.next({});
  }

  estaLogado() {
    return this.tokenService.possuiToken();
  }
}
