import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environments';
import { IRecuperarQuestaoResponse } from '../dto/recuperar-questao-response';
import { IQuestao } from '../models/questao';

@Injectable({ providedIn: 'root' })
export class QuestaoHttpService {
  constructor(private _http: HttpClient) {}

  recuperar() {
    return this._http.get<IRecuperarQuestaoResponse[]>(
      `${environment.apiURL}/questoes`
    );
  }

  criar(enunciado: string) {
    return this._http.post<IQuestao>(`${environment.apiURL}/questoes`, {
      enunciado,
    });
  }

  definirReposta(questaoId: number, alternativaId: number) {
    return this._http.put<void>(
      `${environment.apiURL}/questoes/${questaoId}/resposta`,
      {
        id: alternativaId,
      }
    );
  }
}
