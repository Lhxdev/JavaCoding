package ex1;

import javax.swing.JOptionPane;

public class aviaocargueiro {
	public static void main(String[] args) {
		float pesoTotal=0, pesoPreciosa=0, pesoPrincipal=0, pesoAuxiliar=0;
		int menuEscolha, contCaixas=0;
		String[] alternativa = {"Sim", "Não"};
		do {
			
		String[] tipo = {"Simples", "Preciosa"};
		int tipoCaixa = JOptionPane.showOptionDialog(null, "Qual o tipo da caixa que será carregada?",
                "Escolha uma opção",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, tipo, tipo[0]);
        float peso = Float.parseFloat(JOptionPane.showInputDialog("Qual o peso da caixa?"));
        if(tipoCaixa == 1 && (pesoPreciosa+peso) <= 21) {
        	pesoTotal=pesoTotal+peso;
        	pesoPreciosa=pesoPreciosa+peso;
        	contCaixas++;
        	JOptionPane.showMessageDialog(null, "Caixa colocada com sucesso no compartimento Precioso!");
        }
        else if (tipoCaixa == 1 && (pesoPreciosa+peso) > 21){
        	JOptionPane.showMessageDialog(null, "Não foi possivel colocar a caixa no compartimento correspondente, excede o peso máximo.");
        }
        if (tipoCaixa == 0 && (pesoPrincipal+peso) <= 833) {
        	pesoTotal=pesoTotal+peso;
        	pesoPrincipal=pesoPrincipal+peso;
        	contCaixas++;
        	JOptionPane.showMessageDialog(null, "Caixa colocada com sucesso no compartimento Principal!");
        }
        else if (tipoCaixa == 0 && (pesoPrincipal+peso) > 833) {
        	JOptionPane.showMessageDialog(null, "Não foi possivel colocar a caixa no compartimento Principal, excede o peso máximo.");
        	int alternativaEscolha = JOptionPane.showOptionDialog(null, "Deseja colocar a carga no compartimento auxiliar?",
    				"",
    				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, alternativa, alternativa[0]);
        	if (alternativaEscolha == 0 && (pesoAuxiliar+peso) <= 222) {
        		pesoTotal=pesoTotal+peso;
        		pesoAuxiliar=pesoAuxiliar+peso;
        		contCaixas++;
        		JOptionPane.showMessageDialog(null, "Caixa colocada com sucesso no compartimento Auxiliar!");
        	}
        	else if (alternativaEscolha == 0 && (pesoAuxiliar+peso) > 222) {
        		JOptionPane.showMessageDialog(null, "Não foi possivel colocar a carga no compartimento Auxiliar, excede o peso máximo");
        	}
        	else if(alternativaEscolha == 1) {
        		JOptionPane.showMessageDialog(null, "A caixa não foi colocada.");
        	}
        }
        menuEscolha=menu();
        if (menuEscolha == 1 && pesoTotal >= 500) {
			JOptionPane.showMessageDialog(null, "Avião decolando com "+ contCaixas+" caixas e pesando "+ pesoTotal+" Kg");
		break;
        }
        else if(menuEscolha == 1 && pesoTotal < 500) {
        	JOptionPane.showMessageDialog(null, "Decolagem não autorizada, peso total de caixas inferior a 500 Kg!");
        }
		}
		while (menuEscolha != 2);
		System.out.println(pesoTotal);
		System.out.println(pesoPrincipal);
		System.out.println(pesoAuxiliar);
		System.out.println(pesoPreciosa);
	}

	private static int menu() {
		String[] menu = {"Continuar","Decolar", "Sair"};
		int menuEscolha = JOptionPane.showOptionDialog(null, "O que deseja fazer?",
				"Escolha uma opção",
				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, menu, menu[0]);
		return menuEscolha;
	}
}
