package equipamentoMultifuncional.equipamentos.multifuncional;

import equipamentoMultifuncional.equipamentos.copiadora.Copiadora;
import equipamentoMultifuncional.equipamentos.digitalizadora.Digitalizadora;
import equipamentoMultifuncional.equipamentos.impressora.Impressora;

//Não é possível que uma classe extenda mais de uma classe (Java não permite Herança Múltipla), ex:
//public class EquipamentoMultifuncional extends Impressora, Copiadora, Digitalizadora {


public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
	// Equipamento multifuncional copia, imprime e digitaliza
	// Utilização do conceito de interface para aplicar Herança Múltipla
	
	@Override
	public void imprimir() {
		System.out.println("Imprimindo com a multifuncional");
		
	}

	@Override
	public void digitalizar() {
		System.out.println("Digitalizando com a multifuncional");
		
	}

	@Override
	public void copiar() {
		System.out.println("Copiando com a multifuncional");	
	}
	
}
