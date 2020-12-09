import { PlacanjeComponent } from './placanje/placanje.component';
import { KorpaComponent } from './korpa/korpa/korpa.component';
import { NgModule } from '@angular/core';
import { CommonModule, } from '@angular/common';
import { BrowserModule  } from '@angular/platform-browser';
import { Routes, RouterModule } from '@angular/router';

import { HomeComponent } from './home/home.component';
import { ProfileComponent } from './profile/profile.component';
import { SignupComponent } from './signup/signup.component';
import { LandingComponent } from './landing/landing.component';
import { LoginComponent } from './login/login.component';

const routes: Routes =[
    { path: 'shop', component: LandingComponent },
    { path: '', redirectTo: 'shop', pathMatch: 'full' },
    { path: 'korpa', component: KorpaComponent },
    { path: 'placanje', component: PlacanjeComponent },
];

@NgModule({
  imports: [
    CommonModule,
    BrowserModule,
    RouterModule.forRoot(routes)
  ],
  exports: [
  ],
})
export class AppRoutingModule { }
