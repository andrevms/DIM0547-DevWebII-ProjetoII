import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environments';
import { IRecuperarQuestaoResponse } from '../dto/recuperar-questao-response';

@Injectable({ providedIn: 'root' })
export class QuestaoHttpService {
  constructor(private _http: HttpClient) {}

  recuperar() {
    return this._http.get<IRecuperarQuestaoResponse[]>(
      `${environment.apiURL}/prova`
    );
  }
}
