package pl.solid.zad1_single_responsibility_principle;

public interface IMail {

    void setSender(String sender);

    void setReceiver(String receiver);

    void setContent(IContent content);
}
