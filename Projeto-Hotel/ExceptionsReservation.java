package model.exceptions;

public class DomainException extends RuntimeException { // RuntimeException não te obriga a tratar
    private static final long serialVersionUID = 1L; //  versão de uma classe serial

    public DomainException(String msg) { // construtor que recebe uma string como argumento
        super(msg); // msg fica armazenada dentro da exceção
    }
}