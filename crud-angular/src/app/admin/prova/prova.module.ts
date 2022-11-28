import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ProvaRoutingModule } from './prova-routing.module';
import { CadastrarComponent } from './cadastrar/cadastrar.component';
import { ProvaListarComponent } from './prova-listar/prova-listar.component';


@NgModule({
  declarations: [
    CadastrarComponent,
    ProvaListarComponent
  ],
  imports: [
    CommonModule,
    ProvaRoutingModule
  ]
})
export class ProvaModule { }
