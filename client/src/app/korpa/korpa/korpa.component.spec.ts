/* tslint:disable:no-unused-variable */
import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { By } from '@angular/platform-browser';
import { DebugElement } from '@angular/core';

import { KorpaComponent } from './korpa.component';

describe('KorpaComponent', () => {
  let component: KorpaComponent;
  let fixture: ComponentFixture<KorpaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ KorpaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(KorpaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
