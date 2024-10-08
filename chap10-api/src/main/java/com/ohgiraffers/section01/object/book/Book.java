package main.java.com.ohgiraffers.section01.object.book;

public class Book {

    private int number;
    private String title;
    private String author;
    private int price;


    public Book() {
    }

    public Book(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Book{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object obj/*b*/) {
        if (this/*a*/ == obj/*b*/) {
            return true;
        }
        if (obj == null) { // null은 비교가 안 된다.
            return false;
        }
        Book other = (Book) obj; // 부모인 오브제이를 자식 북으로 다운캐스팅했다.
        if (this.number != other.number) {
            return false;
        }

        if (this.title == null) {
            if (other.title != null) {
                return false;
            }

        }else if (!this.title.equals(other.title)) {
            return false;
        }if (this.author == null) {
            if (other.author != null) {
                return false;
            }
        } else if (!this.author.equals(other.author)) {
            return false;
        }
        if (this.price != other.price) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {

        int result = 1;

        final int PRIME = 31; // 소수 라서 동일 값이 잘 나오지 않는다. 통상적인 숫자로 쓴다.

        result = PRIME * result + this.number;
        result = PRIME * result + this.title.hashCode();
        result = PRIME * result + this.author.hashCode();
        result = PRIME * result + this.price;

        return result;
    }
}
