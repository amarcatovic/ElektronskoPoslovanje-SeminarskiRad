/* tslint:disable:no-unused-variable */

import { TestBed, async, inject } from '@angular/core/testing';
import { KorpaService } from './korpa.service';

describe('Service: Korpa', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [KorpaService]
    });
  });

  it('should ...', inject([KorpaService], (service: KorpaService) => {
    expect(service).toBeTruthy();
  }));
});
