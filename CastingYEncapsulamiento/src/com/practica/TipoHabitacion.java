package com.practica;

public class TipoHabitacion {
		
		private int precio;
		private String tipo;
		

		public TipoHabitacion() {
			super();
		}


		public TipoHabitacion(int precio, String tipo) {
			super();
			this.precio = precio;
			this.tipo = tipo;
		}
		
		
		public int getPrecio() {
			return precio;
		}


		public void setPrecio(int precio) {
			this.precio = precio;
		}


		public String getTipo() {
			return tipo;
		}


		public void setTipo(String tipo) {
			this.tipo = tipo;
		}



		
		@Override
		public String toString() {
			return "TipoHabitacion [precio=" + precio + ", tipo=" + tipo + "]";
		}
		

}

