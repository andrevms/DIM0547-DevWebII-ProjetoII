import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ProvaListarComponent } from './prova-listar/prova-listar.component';

const routes: Routes = [
  {
    path: '',
    component: ProvaListarComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ProvaRoutingModule { }
