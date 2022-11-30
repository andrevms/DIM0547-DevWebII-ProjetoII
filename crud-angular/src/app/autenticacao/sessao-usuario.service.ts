import { Injectable } from '@angular/core';
import { IUsuarioAutenticadoInfoResponseDto } from './interfaces';
import { TokenService } from './token.service';

@Injectable({
  providedIn: 'root',
})
export class SessaoUsuarioService {
  private _sessao: IUsuarioAutenticadoInfoResponseDto | undefined;

  atualizarSessao(sessao: IUsuarioAutenticadoInfoResponseDto) {
    this._sessao = sessao;
  }

  recuperarSessao() {
    return this._sessao;
  }

  estaLogado() {
    return this._sessao ? true : false;
  }

  destruirSessao() {
    this._sessao = undefined;
  }
}
