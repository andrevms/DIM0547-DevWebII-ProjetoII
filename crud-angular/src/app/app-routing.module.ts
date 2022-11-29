import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AutenticacaoGuard } from './autenticacao/autenticacao.guard';
import { ListaPermissoesComponent } from './permissoes/lista-permissoes/lista-permissoes.component';

const routes: Routes = [
  {
    path: '',
    pathMatch: 'full',
    redirectTo: 'home',
  },
  {
    path: 'home',
    loadChildren: () => import('./home/home.module').then((m) => m.HomeModule),
  },
  {
    path: 'provas',
    loadChildren: () =>
      import('./provas/provas.module').then((m) => m.ProvasModule),
  },
  {
    path: 'questoes',
    loadChildren: () =>
      import('./questoes/questoes.module').then((m) => m.QuestoesModule),
  },
  {
    path: 'permissoes',
    component: ListaPermissoesComponent,
    canLoad: [AutenticacaoGuard],
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
