package com.letscode.authorization.domain.model;

import com.letscode.authorization.domain.model.enums.ClientTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor @NoArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @CreationTimestamp
    private Date created_at;
    @com.sun.istack.NotNull
    @Column(unique = true)
    private String email;
    @com.sun.istack.NotNull
    private String name;
    @NotNull
    private String password;
    @Enumerated(EnumType.STRING)
    private ClientTypeEnum type;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Point> points;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Review> likeReview;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Review> dislikeReviews;
}