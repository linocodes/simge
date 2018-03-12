package br.gov.mg.meioambiente.simge.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.mg.meioambiente.simge.entity.Note;

/**
 * Created by rajeevkumarsingh on 27/06/17.
 */
public interface NoteRepository extends JpaRepository<Note, Long> {

}
