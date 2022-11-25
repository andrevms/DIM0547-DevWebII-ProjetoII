import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { QuestoesComponent } from './questoes/questoes.component';

const routes: Routes = [
  { path: '', component: QuestoesComponent}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class QuestoesRoutingModule { }
