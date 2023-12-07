package catolica.mini.curso.curso.jenkins.cursojenkins.service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {
    public String hello(){
        return "Bem vindo ao curso de jenkins";
    }

    public int somar(int a, int b){
        return a+b;
    }

    public int subtrair(int a, int b){
        return a-b;
    }
}
