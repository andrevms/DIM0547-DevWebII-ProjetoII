import { Component } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Observable } from 'rxjs';
import { IListarUsuarioResponseDto } from 'src/app/common/dto/listar-usuario-response.dto';
import { ProvaHttpService } from 'src/app/common/http/prova-http.service';
import { UsuarioHttpService } from 'src/app/common/http/usuario-http.service';

@Component({
  selector: 'app-usuario-listar',
  templateUrl: './usuario-listar.component.html',
  styleUrls: ['./usuario-listar.component.scss'],
})
export class UsuarioListarComponent {
  usuarios$!: Observable<IListarUsuarioResponseDto[]>;
  displayedColumns: string[] = ['nome', 'acoes'];

  constructor(private _usuarioHttpService: UsuarioHttpService) {}

  ngOnInit() {
    this.usuarios$ = this._usuarioHttpService.recuperar();
  }
}
