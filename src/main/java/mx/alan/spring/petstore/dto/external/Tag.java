package mx.alan.spring.petstore.dto.external;

public class Tag {
    private Long id;
    private String name;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TagExternalResponse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
