import { Proizvod } from './../shared/models/Proizvod';
import { KorpaService } from './../shared/services/korpa.service';
import { Component, OnInit } from '@angular/core';

@Component({
    selector: 'app-landing',
    templateUrl: './landing.component.html',
    styleUrls: ['./landing.component.scss']
})

export class LandingComponent implements OnInit {
  focus: any;
  focus1: any;

  constructor(private korpaServis: KorpaService) { }

  ngOnInit() {}

  dodajUKorpu(naziv: string, cijena: number): void{
    let proizvod: Proizvod = new Proizvod();
    proizvod.naziv = naziv;
    proizvod.cijena = cijena;

    this.korpaServis.proizvodi.push(proizvod);
  }

}