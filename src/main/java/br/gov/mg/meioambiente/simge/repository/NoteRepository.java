package br.gov.mg.meioambiente.simge.repository;

import org.springframework.stereotype.Repository;

import br.gov.mg.meioambiente.simge.entity.Note;

@Repository
public interface NoteRepository extends BaseRepository<Note, Long> {

}
