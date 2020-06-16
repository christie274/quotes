package edu.cnm.deepdive.quotes.model.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import javax.annotation.Nonnull;

@Entity (
    indices = @Index(value = "name", unique = true)
)
public class Source {

  @PrimaryKey(autoGenerate = true)
  @ColumnInfo(name = "source_id")
  private long id;

  @Nonnull
  @ColumnInfo(collate = ColumnInfo.NOCASE)
  private String name = "";

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
