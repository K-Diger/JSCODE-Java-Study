package src.class4;

public class Book {

    private Integer number;
    private String name;
    private Boolean status;

    public Book(Integer number, String bookName, Boolean status) {
        this.number = number;
        this.name = bookName;
        this.status = status;
    }

    public Integer getNumber() {
        return this.number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public Boolean getStatus() {
        return this.status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
