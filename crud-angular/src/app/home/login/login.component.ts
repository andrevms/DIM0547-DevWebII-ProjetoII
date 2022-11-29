import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { AutenticacaoService } from 'src/app/autenticacao/autenticacao.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss'],
})
export class LoginComponent {
  loginValido = true;
  email = '';
  senha = '';

  constructor(
    private authService: AutenticacaoService,
    private router: Router
  ) {}

  login(): void {
    this.authService.autenticar(this.email, this.senha).subscribe(
      () => {
        this.loginValido = true;
        this.router.navigate(['provas']);
      },
      (error) => {
        this.loginValido = false;
        console.log(error);
      }
    );
  }
}
