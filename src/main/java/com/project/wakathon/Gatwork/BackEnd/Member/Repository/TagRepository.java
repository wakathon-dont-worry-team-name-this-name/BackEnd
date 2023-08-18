package com.project.wakathon.Gatwork.BackEnd.Member.Repository;

import com.project.wakathon.Gatwork.BackEnd.Member.domain.Tag;
import com.project.wakathon.Gatwork.BackEnd.Member.domain.TagCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

public interface TagRepository extends JpaRepository<Tag, Integer>, CustomRepository {
}
