public class Atividade4 {
	public static void main(String[] args) {
//		JTable table = null;
//		Object[] cols = { "Cor", "C�digo" };
//		DefaultTableModel tableModel = new DefaultTableModel(cols, 0);
//
//		for (Cores c : Cores.values()) {
//			List<String> valores = new ArrayList<>();
//			valores.add(c.getNomeCor());
//			valores.add(String.valueOf(c.getCodigoCor()));
//
//			tableModel.addRow(Arrays.asList(c.getNomeCor(), String.valueOf(c.getCodigoCor())).toArray());
//		}
//
//		table = new JTable(tableModel);
//
//		JOptionPane.showMessageDialog(null, new JScrollPane(table));
//
//		JOptionPane.showMessageDialog(null, "C�digo da cor branca: " + Cores.BRANCO.getCodigoCor());
		
		
		Aeroporto a = new Aeroporto("Guarulhos");
		Aviao aviaoTan = new Aviao("TAN 123", a);
		Aviao aviaoOLE = new Aviao("OL� 11", a);
		Aviao aviaoLinha = new Aviao("LINHA 22", a);

		a.start();
		aviaoTan.start();
		aviaoOLE.start();
		aviaoLinha.start();
	}
}
