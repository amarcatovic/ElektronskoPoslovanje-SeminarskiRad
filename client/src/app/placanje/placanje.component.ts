import { KorpaService } from './../shared/services/korpa.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-placanje',
  templateUrl: './placanje.component.html',
  styleUrls: ['./placanje.component.scss']
})
export class PlacanjeComponent implements OnInit {

  brojKartice: string = '';
  jeLiPlaceno: boolean = false;

  constructor(private servisZaPlacanje: KorpaService) { }

  ngOnInit() {
  }

  plati(){
    this.servisZaPlacanje.plati(this.brojKartice)
      .subscribe(response => {
        if(response.jeLiUspjelo){
          this.jeLiPlaceno = true;
        }
      })
  }


}
