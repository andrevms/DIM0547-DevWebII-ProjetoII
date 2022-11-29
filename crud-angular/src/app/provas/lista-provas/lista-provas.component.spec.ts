import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListaProvasComponent } from './lista-provas.component';

describe('ListaProvasComponent', () => {
  let component: ListaProvasComponent;
  let fixture: ComponentFixture<ListaProvasComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListaProvasComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ListaProvasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
