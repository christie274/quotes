package edu.cnm.deepdive.quotes.model.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
import javax.annotation.Nonnull;

@Entity(
    foreignKeys = @ForeignKey(
        entity = Source.class,
        parentColumns = "source_id",
        childColumns = "source_id",
        onDelete = ForeignKey.SET_NULL
    )
)
public class Quote {

  @PrimaryKey(autoGenerate = true)
  @ColumnInfo(name = "quote_id")
  private long id;

  @ColumnInfo(name = "source_id", index = true)
  private long sourceId;

  @Nonnull
  @ColumnInfo(collate = ColumnInfo.NOCASE)
  private String text = "";

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getSourceId() {
    return sourceId;
  }

  public void setSourceId(long sourceId) {
    this.sourceId = sourceId;
  }

  @Nonnull
  public String getText() {
    return text;
  }

  public void setText(@Nonnull String text) {
    this.text = text;
  }

  @NonNull
  @Override
  public String toString() {
    return text;
  }

}
