package estabelecimento;

import equipamentoMultifuncional.equipamentos.copiadora.Copiadora;
import equipamentoMultifuncional.equipamentos.digitalizadora.Digitalizadora;
import equipamentoMultifuncional.equipamentos.impressora.Deskjet;
import equipamentoMultifuncional.equipamentos.impressora.Impressora;
import equipamentoMultifuncional.equipamentos.impressora.LaserJet;
import equipamentoMultifuncional.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
	public static void main(String[] args) {
		// Tipando as impressoras com a interface Impressora
		Impressora impressoraDeskjet = new Deskjet();
		Impressora impressoraLaserJet = new LaserJet();
		Impressora impressoraMultifuncional = new EquipamentoMultifuncional();
		
		// Cada instância tem seu método específico imprimir
		impressoraDeskjet.imprimir();
		// imprime "Imprimindo com Deskjet."
		impressoraLaserJet.imprimir();
		// imprime "Imprimindo com LaserJet."
		impressoraMultifuncional.imprimir();
		// imprime "Imprimindo com a multifuncional."
		
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		Impressora impressora = em;
		Digitalizadora digitalizadora = em;
		Copiadora copiadora = em;
		
		// Tipando o EquipamentoMultifuncional como Impressora, Digitalizadora e Copiadora
		// Logo o EquipamentoMultifuncional pode representar qualquer um dos três papeis
		// Pois implementa características/interfaces dos 3
		impressora.imprimir();
		// imprime "Imprimindo com a multifuncional."
		digitalizadora.digitalizar();
		// imprime "Digitalizando com a multifuncional."
		copiadora.copiar();
		// imprime "Copiando com a multifuncional."
	}
}
