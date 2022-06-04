package uz.isystem.CertificateService.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlIDREF;

@Getter
@Setter

@Entity
@Table(name = ("direction"))
public class Direction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;




}
