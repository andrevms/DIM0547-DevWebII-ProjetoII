import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ListaProvasComponent } from './lista-provas/lista-provas.component';

const routes: Routes = [
  {
    path: '',
    component: ListaProvasComponent,
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class ProvasRoutingModule {}
