package com.blogforum.notebook.service.note;

import com.blogforum.notebook.pojo.entity.NoteBody;
import com.blogforum.notebook.service.BaseService;

public interface NoteBodyService extends BaseService<NoteBody> {

	public NoteBody getByNoteTitleId(String noteTitleId);
}
