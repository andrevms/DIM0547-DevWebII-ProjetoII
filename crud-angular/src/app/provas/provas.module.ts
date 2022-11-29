import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ProvasRoutingModule } from './provas-routing.module';
import { ListaProvasComponent } from './lista-provas/lista-provas.component';


@NgModule({
  declarations: [
    ListaProvasComponent
  ],
  imports: [
    CommonModule,
    ProvasRoutingModule
  ]
})
export class ProvasModule { }
