import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { QuestaoListarComponent } from './listar/listar.component';

const routes: Routes = [
  {
    path: '',
    component: QuestaoListarComponent
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class QuestaoRoutingModule { }
