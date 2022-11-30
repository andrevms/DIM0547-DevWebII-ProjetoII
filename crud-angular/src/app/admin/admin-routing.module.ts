import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PermissaoAdminGuard } from './permissao-admin.guard';
import { SemAutorizacaoComponent } from './sem-autorizacao/sem-autorizacao.component';

const routes: Routes = [
  {
    path: 'prova',
    loadChildren: () =>
      import('./prova/prova.module').then((m) => m.ProvaModule),
    canLoad: [PermissaoAdminGuard],
  },
  {
    path: 'sem-autorizacao',
    component: SemAutorizacaoComponent,
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class AdminRoutingModule {}
