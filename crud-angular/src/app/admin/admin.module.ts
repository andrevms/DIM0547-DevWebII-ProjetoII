import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AdminRoutingModule } from './admin-routing.module';
import { SemAutorizacaoComponent } from './sem-autorizacao/sem-autorizacao.component';

@NgModule({
  declarations: [
    SemAutorizacaoComponent
  ],
  imports: [CommonModule, AdminRoutingModule],
})
export class AdminModule {}
