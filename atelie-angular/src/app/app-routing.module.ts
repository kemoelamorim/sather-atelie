import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  {
    path: 'authenticate',
    loadChildren: () => import('./authenticate/authenticate.module').then(m => m.AuthenticateModule)
  },
  {
    path: '',
    redirectTo: 'authenticate',
    pathMatch: 'full'
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
