import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environments';
import { IRecuperarQuestaoResponse } from '../dto/recuperar-questao-response';
import { IAlternativa } from '../models/alternativa';
import { IQuestao } from '../models/questao';

@Injectable({ providedIn: 'root' })
export class AlternativaHttpService {
  constructor(private _http: HttpClient) {}

  // recuperar() {
  //   return this._http.get<IRecuperarQuestaoResponse[]>(
  //     `${environment.apiURL}/prova`
  //   );
  // }

  criar(questaoId: number, alternativa: string) {
    return this._http.post<IAlternativa>(`${environment.apiURL}/alternativa`, {
      questaoId,
      alternativa,
    });
  }
}
