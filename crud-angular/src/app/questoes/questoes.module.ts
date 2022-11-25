import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { QuestoesRoutingModule } from './questoes-routing.module';
import { QuestoesComponent } from './questoes/questoes.component';


@NgModule({
  declarations: [
    QuestoesComponent
  ],
  imports: [
    CommonModule,
    QuestoesRoutingModule
  ]
})
export class QuestoesModule { }
