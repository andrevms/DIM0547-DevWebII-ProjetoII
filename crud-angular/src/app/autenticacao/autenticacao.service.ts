import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, tap } from 'rxjs';
import { environment } from 'src/environments/environments';
import { Auth } from './auth';
import { UsuarioService } from './usuario/usuario.service';

const API = environment.apiURL;

@Injectable({
  providedIn: 'root',
})
export class AutenticacaoService {
  constructor(
    private httpClient: HttpClient,
    private usuarioService: UsuarioService
  ) {}

  autenticar(email: string, senha: string): Observable<any> {
    return this.httpClient
      .post<Auth>(`${API}/usuarios/auth`, {
        email: email,
        senha: senha,
      })
      .pipe(
        tap((res) => {
          this.usuarioService.salvarToken(res.token);
        })
      );
  }
}
