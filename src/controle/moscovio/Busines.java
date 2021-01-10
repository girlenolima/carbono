package controle.moscovio;

import java.util.ArrayList;
import java.util.List;

import modelo.moscovio.Recibo;

public class Busines implements interfaces.interfaceBusines {

    @Override
    public void CriarPDF(String origemPlanilha, String destinoPDF) {

 
        List<Recibo> emitentes = new ArrayList<>();
        Excel c = new Excel();

        emitentes = c.lerExcel(origemPlanilha);

        for (int i = 0; i < emitentes.size(); i++) {

            Texto texto = new Texto(emitentes.get(i));
            String tx = texto.criarTextoBase();

            Pdf pdf = new Pdf(tx);
            pdf.criaPDF(13, emitentes.get(i).getNome(), destinoPDF);

        }
  
    }

}
