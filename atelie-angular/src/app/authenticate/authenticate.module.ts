import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AuthenticateRoutingModule } from './authenticate-routing.module';
import { AuthenticateComponent } from './authenticate.component';
import { LoginComponent } from './login/login.component';
import { NovoUsuarioComponent } from './novo-usuario/novo-usuario.component';


@NgModule({
  declarations: [
    AuthenticateComponent,
    LoginComponent,
    NovoUsuarioComponent
  ],
  imports: [
    CommonModule,
    AuthenticateRoutingModule
  ]
})
export class AuthenticateModule { }
