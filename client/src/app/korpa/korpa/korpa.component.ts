import { KorpaService } from './../../shared/services/korpa.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-korpa',
  templateUrl: './korpa.component.html',
  styleUrls: ['./korpa.component.scss']
})
export class KorpaComponent implements OnInit {

  prihvaceniUslovi: boolean = false;

  constructor(public korpa: KorpaService) { }

  ngOnInit() {
  }

  prihvatiUslove(){
    this.prihvaceniUslovi = !this.prihvaceniUslovi;
  }

}
