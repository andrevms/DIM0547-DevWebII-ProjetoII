import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatToolbarModule } from '@angular/material/toolbar';
import { HttpClientModule } from '@angular/common/http';
import { ListaPermissoesComponent } from './permissoes/lista-permissoes/lista-permissoes.component';
import { AutenticacaoModule } from './autenticacao/autenticacao.module';

@NgModule({
  declarations: [AppComponent, ListaPermissoesComponent],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    HttpClientModule,
    AutenticacaoModule,
  ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
