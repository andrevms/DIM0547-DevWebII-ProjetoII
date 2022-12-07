import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environments';
import { IListarUsuarioResponseDto } from '../dto/listar-usuario-response.dto';

@Injectable({
  providedIn: 'root',
})
export class UsuarioHttpService {
  constructor(private _http: HttpClient) {}

  recuperar(): Observable<IListarUsuarioResponseDto[]> {
    return this._http.get<IListarUsuarioResponseDto[]>(
      `${environment.apiURL}/usuarios`
    );
  }

  excluir(id: number) {
    return this._http.delete<void>(`${environment.apiURL}/usuarios/${id}`);
  }
}
