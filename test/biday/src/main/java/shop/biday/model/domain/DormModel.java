package shop.biday.model.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import shop.biday.model.entity.*;

import java.util.List;

@Data
@Builder
@Component
@NoArgsConstructor
@AllArgsConstructor
public class DormModel {
    private Long id;
    private String name;
    private String description;
    private String contactNum;
    private String city;
    private String town;
    private String address;
    private String status;
    private CategoryEntity dcategory;
    private UsersEntity users;
    private List<RoomEntity> rooms;
    private List<DamenityEntity> damenityEntities;

    public DormEntity toEntity() {
        return DormEntity.builder()
                .id(id)
                .name(name)
                .description(description)
                .contactNum(contactNum)
                .city(city)
                .town(town)
                .address(address)
                .status(status)
                .dcategory(dcategory)
                .user(users)
                .rooms(rooms)
                .damenities(damenityEntities)
                .build();
    }
}