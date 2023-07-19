package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaBoasVindas extends JFrame {
    public TelaBoasVindas() {
        setTitle("Bem-vindo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(320, 290);
        setLayout(new GridBagLayout());
        setLocationRelativeTo(null);

        JLabel tituloLabel = new JLabel(" Menu ");
        tituloLabel.setFont(new Font("Arial", Font.BOLD, 16));

        JButton cadastrarMedicoButton = new JButton("Cadastrar Médico");
        JButton cadastrarConsultaButton = new JButton("Cadastrar Consulta");
        JButton visualizarAgendaButton = new JButton("Visualizar Agenda Médico");
        JButton cancelarConsultaButton = new JButton("Cancelar Consulta");
        JButton sairButton = new JButton("Sair");

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = GridBagConstraints.RELATIVE;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;

        add(tituloLabel, gbc);
        add(cadastrarMedicoButton, gbc);
        add(cadastrarConsultaButton, gbc);
        add(visualizarAgendaButton, gbc);
        add(cancelarConsultaButton, gbc);
        add(sairButton, gbc);

        cadastrarMedicoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cadastrarMedico();
            }
        });

        cadastrarConsultaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cadastrarConsulta();
            }
        });

        visualizarAgendaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                visualizarAgendaMedico();
            }
        });

        cancelarConsultaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cancelarConsulta();
            }
        });

        sairButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sair();
            }
        });

        setVisible(true);
    }

    public void cadastrarMedico() {

        JOptionPane.showMessageDialog(null, "Opção: Cadastrar Médico");
    }

    public void cadastrarConsulta() {
        // Implementação do cadastro de consulta
        JOptionPane.showMessageDialog(null, "Opção: Cadastrar Consulta");
    }

    public void visualizarAgendaMedico() {
        // Implementação da visualização da agenda do médico
        JOptionPane.showMessageDialog(null, "Opção: Visualizar Agenda Médico");
    }

    public void cancelarConsulta() {
        // Implementação do cancelamento de consulta
        JOptionPane.showMessageDialog(null, "Opção: Cancelar Consulta");
    }

    public void sair() {
        JOptionPane.showMessageDialog(null, "Opção: Sair");
        System.exit(0);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TelaBoasVindas();
            }
        });
    }
}
